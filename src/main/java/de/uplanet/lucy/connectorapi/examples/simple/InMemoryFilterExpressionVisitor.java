/*
 * $Id$
 *
 * Copyright 2000-2018 United Planet GmbH, Freiburg Germany
 * All Rights Reserved.
 */

package de.uplanet.lucy.connectorapi.examples.simple;

import org.odata4j.expression.AddExpression;
import org.odata4j.expression.AggregateAllFunction;
import org.odata4j.expression.AggregateAnyFunction;
import org.odata4j.expression.AndExpression;
import org.odata4j.expression.BinaryLiteral;
import org.odata4j.expression.BoolParenExpression;
import org.odata4j.expression.BooleanLiteral;
import org.odata4j.expression.ByteLiteral;
import org.odata4j.expression.CastExpression;
import org.odata4j.expression.CeilingMethodCallExpression;
import org.odata4j.expression.ConcatMethodCallExpression;
import org.odata4j.expression.DateTimeLiteral;
import org.odata4j.expression.DateTimeOffsetLiteral;
import org.odata4j.expression.DayMethodCallExpression;
import org.odata4j.expression.DecimalLiteral;
import org.odata4j.expression.DivExpression;
import org.odata4j.expression.DoubleLiteral;
import org.odata4j.expression.EndsWithMethodCallExpression;
import org.odata4j.expression.EntitySimpleProperty;
import org.odata4j.expression.EqExpression;
import org.odata4j.expression.FloorMethodCallExpression;
import org.odata4j.expression.GeExpression;
import org.odata4j.expression.GtExpression;
import org.odata4j.expression.GuidLiteral;
import org.odata4j.expression.HourMethodCallExpression;
import org.odata4j.expression.IndexOfMethodCallExpression;
import org.odata4j.expression.Int64Literal;
import org.odata4j.expression.IntegralLiteral;
import org.odata4j.expression.IsofExpression;
import org.odata4j.expression.LeExpression;
import org.odata4j.expression.LengthMethodCallExpression;
import org.odata4j.expression.LtExpression;
import org.odata4j.expression.MinuteMethodCallExpression;
import org.odata4j.expression.ModExpression;
import org.odata4j.expression.MonthMethodCallExpression;
import org.odata4j.expression.MulExpression;
import org.odata4j.expression.NeExpression;
import org.odata4j.expression.NegateExpression;
import org.odata4j.expression.NotExpression;
import org.odata4j.expression.NullLiteral;
import org.odata4j.expression.OrExpression;
import org.odata4j.expression.OrderByExpression;
import org.odata4j.expression.OrderByExpression.Direction;
import org.odata4j.expression.ParenExpression;
import org.odata4j.expression.PreOrderVisitor;
import org.odata4j.expression.ReplaceMethodCallExpression;
import org.odata4j.expression.RoundMethodCallExpression;
import org.odata4j.expression.SByteLiteral;
import org.odata4j.expression.SecondMethodCallExpression;
import org.odata4j.expression.SingleLiteral;
import org.odata4j.expression.StartsWithMethodCallExpression;
import org.odata4j.expression.StringLiteral;
import org.odata4j.expression.SubExpression;
import org.odata4j.expression.SubstringMethodCallExpression;
import org.odata4j.expression.SubstringOfMethodCallExpression;
import org.odata4j.expression.TimeLiteral;
import org.odata4j.expression.ToLowerMethodCallExpression;
import org.odata4j.expression.ToUpperMethodCallExpression;
import org.odata4j.expression.TrimMethodCallExpression;
import org.odata4j.expression.YearMethodCallExpression;

/**
 * A filter visitor to extract fields and values from Intrexx datagroup filter expressions.
 */
public class InMemoryFilterExpressionVisitor extends PreOrderVisitor {

	private String m_lastProp;
	private String m_title;
	private Boolean m_boolean;

	public InMemoryFilterExpressionVisitor()
	{
	}

	public String getLastProp()
	{
		return m_lastProp;
	}

	public String getTitle()
	{
		return m_title;
	}

	public Boolean getBoolean()
	{
		return m_boolean;
	}

	@Override
	public void afterDescend()
	{

	}

	@Override
	public void beforeDescend()
	{

	}

	@Override
	public void betweenDescend()
	{

	}

	@Override
	public void visit(String p_value)
	{

	}

	@Override
	public void visit(OrderByExpression p_arg)
	{

	}

	@Override
	public void visit(Direction p_arg)
	{

	}

	@Override
	public void visit(AddExpression p_arg)
	{

	}

	@Override
	public void visit(AndExpression p_arg)
	{

	}

	@Override
	public void visit(BooleanLiteral p_value)
	{
		switch (m_lastProp)
		{
			case "Boolean":
				m_boolean = Boolean.valueOf(p_value.getValue());
				break;
		}
		m_lastProp = null;
		return;
	}

	@Override
	public void visit(CastExpression p_arg)
	{

	}

	@Override
	public void visit(ConcatMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(DateTimeLiteral p_arg)
	{

	}

	@Override
	public void visit(DateTimeOffsetLiteral p_arg)
	{

	}

	@Override
	public void visit(DecimalLiteral p_arg)
	{

	}

	@Override
	public void visit(DivExpression p_arg)
	{

	}

	@Override
	public void visit(EndsWithMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(EntitySimpleProperty p_arg)
	{
		m_lastProp = p_arg.getPropertyName();
	}

	@Override
	public void visit(EqExpression p_arg)
	{

	}

	@Override
	public void visit(GeExpression p_arg)
	{

	}

	@Override
	public void visit(GtExpression p_arg)
	{


	}

	@Override
	public void visit(GuidLiteral p_arg)
	{

	}

	@Override
	public void visit(BinaryLiteral p_arg)
	{

	}

	@Override
	public void visit(ByteLiteral p_arg)
	{

	}

	@Override
	public void visit(SByteLiteral p_arg)
	{

	}

	@Override
	public void visit(IndexOfMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(SingleLiteral p_arg)
	{

	}

	@Override
	public void visit(DoubleLiteral p_arg)
	{

	}

	@Override
	public void visit(IntegralLiteral p_arg)
	{
	}

	@Override
	public void visit(Int64Literal p_arg)
	{

	}

	@Override
	public void visit(IsofExpression p_arg)
	{

	}

	@Override
	public void visit(LeExpression p_arg)
	{

	}

	@Override
	public void visit(LengthMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(LtExpression p_arg)
	{

	}

	@Override
	public void visit(ModExpression p_arg)
	{

	}

	@Override
	public void visit(MulExpression p_arg)
	{

	}

	@Override
	public void visit(NeExpression p_arg)
	{

	}

	@Override
	public void visit(NegateExpression p_arg)
	{

	}

	@Override
	public void visit(NotExpression p_arg)
	{

	}

	@Override
	public void visit(NullLiteral p_arg)
	{

	}

	@Override
	public void visit(OrExpression p_arg)
	{

	}

	@Override
	public void visit(ParenExpression p_arg)
	{

	}

	@Override
	public void visit(BoolParenExpression p_arg)
	{

	}

	@Override
	public void visit(ReplaceMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(StartsWithMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(StringLiteral p_value)
	{
		switch (m_lastProp)
		{
			case "Title":
				m_title = p_value.getValue();
				break;
			default:
				break;
		}
		m_lastProp = null;
		return;
	}

	@Override
	public void visit(SubExpression p_arg)
	{

	}

	@Override
	public void visit(SubstringMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(SubstringOfMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(TimeLiteral p_arg)
	{

	}

	@Override
	public void visit(ToLowerMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(ToUpperMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(TrimMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(YearMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(MonthMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(DayMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(HourMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(MinuteMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(SecondMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(RoundMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(FloorMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(CeilingMethodCallExpression p_arg)
	{

	}

	@Override
	public void visit(AggregateAnyFunction p_arg)
	{

	}

	@Override
	public void visit(AggregateAllFunction p_arg)
	{

	}
}